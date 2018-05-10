package com.music.demo.product.service.impl;

import com.music.demo.aliyunvideo.Utils.PropertiesCopyUtil;
import com.music.demo.aliyunvideo.vo.aliyunvo.CreateUploadVideoVo;
import com.music.demo.aliyunvideo.vo.returnvo.CourseRecommend;
import com.music.demo.aliyunvideo.vo.returnvo.ProductDatilType;
import com.music.demo.aliyunvideo.vo.returnvo.ReturnProductMes;
import com.music.demo.aliyunvideo.vo.returnvo.ProductType;
import com.music.demo.dao.dao.mybatis.ProductDetailMapper;
import com.music.demo.dao.dao.mybatis.ProductMesMapper;
import com.music.demo.dao.dao.mybatis.ProductTypeMapper;
import com.music.demo.dao.entity.mybatis.ProductDetail;
import com.music.demo.dao.entity.mybatis.ProductDetailExample;
import com.music.demo.dao.entity.mybatis.ProductMes;
import com.music.demo.dao.entity.mybatis.ProductMesExample;
import com.music.demo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductTypeMapper productTypeMapper;
    @Autowired
    ProductMesMapper productMesMapper;
    @Autowired
    ProductDetailMapper  productDetailMapper;
    private List<com.music.demo.dao.entity.mybatis.ProductType> getAllProdctType() {
        List<com.music.demo.dao.entity.mybatis.ProductType> listproType = productTypeMapper.selectAll();
        return listproType;
    }

    public int saveProductDetail(ProductDetail productDetail){
     return   productDetailMapper.insert(productDetail);

    }

//    public List<com.music.demo.dao.entity.mybatis.ProductType> getProdctType() {
//        List<com.music.demo.dao.entity.mybatis.ProductType> listproType = productTypeMapper.selectAll();
//        for (int i = 0; i <= listproType.size(); i++) {
//            if (listproType.get(i).getProductParentId().length() != 6) {
//                listproType.remove(i);
//            }
//        }
//
//        return listproType;
//    }


    public List<ProductDetail> getProductMes(CreateUploadVideoVo createUploadVideoVo) {

        ProductDetailExample pe = new ProductDetailExample();
        pe.setOrderByClause("c_course_detail_id desc");
        ProductDetailExample.Criteria criteria = pe.createCriteria();
        criteria.andCourseDetailIdLike(createUploadVideoVo.getCourseId()+"%");
        List list = productDetailMapper.selectByExample(pe);

        return list;
    }

    public  int updateUploadFlag(String fileName){
        ProductDetailExample pe = new ProductDetailExample();
        ProductDetailExample.Criteria criteria = pe.createCriteria();
        criteria.andCourseTitleEqualTo(fileName);
        ProductDetail ProductDetail =new ProductDetail();
        ProductDetail.setCourseFlag("1");
       return  productDetailMapper.updateByExampleSelective(ProductDetail,pe);

    }
    private List<ProductMes> getProductMes() {
        ProductMesExample pe = new ProductMesExample();
        pe.setOrderByClause("c_course_top_order ");
        ProductMesExample.Criteria criteria = pe.createCriteria();
        List list = productMesMapper.selectByExample(pe);

        return list;
    }



    public ProductMes getProductMes(String courseId){
        ProductMes productMes =new ProductMes();
        productMes.setCourseId(courseId);
        productMes= (ProductMes) productMesMapper.select(productMes).get(0);
        return productMes;

    }

    public List<ProductDetail> getProductDetail(String courseId){

        ProductDetailExample pe = new ProductDetailExample();
        pe.setOrderByClause("c_course_detail_id asc");
        ProductDetailExample.Criteria criteria = pe.createCriteria();
        criteria.andCourseDetailIdLike(courseId+"%");
        return  productDetailMapper.selectByExample(pe);

    }


    @Override
    public ReturnProductMes getProductIndex() {

        //获取分类
        List<com.music.demo.dao.entity.mybatis.ProductType> listAll = getAllProdctType();
        //设置课程
        List<ProductMes> listProductMes = getProductMes();

        //声明需要使用的容器
        List<com.music.demo.aliyunvideo.vo.returnvo.CourseRecommend> listCourseRecommend = new ArrayList();
        ReturnProductMes proMes = new ReturnProductMes();
        List<ProductType> listProductType = new ArrayList();


        // 获取所有的分类信息
        for (com.music.demo.dao.entity.mybatis.ProductType protype : listAll) {
            //将大类菜单 音乐存入返回值
            if (protype.getProductParentId().length() == 6) {
                ProductType pt = new ProductType();
                PropertiesCopyUtil.copyProperties(protype, pt, null);
                List<ProductDatilType> list = new ArrayList();
                //根据大类循环出子类并设到返回值
                for (com.music.demo.dao.entity.mybatis.ProductType protypeall : listAll) {
                    if (protypeall.getProductParentId().contains(pt.getProductParentId()) && !protypeall.getProductParentId().equals(pt.getProductParentId())) {
                        com.music.demo.aliyunvideo.vo.returnvo.ProductDatilType pdt = new com.music.demo.aliyunvideo.vo.returnvo.ProductDatilType();
                        PropertiesCopyUtil.copyProperties(protypeall, pdt, null);

                        //获取当前吉他分类的课程 用于首页展示，暂时的 ，因为内容过少展示效果不好。
                        List<CourseRecommend> listcr =new ArrayList();
                        for (ProductMes productMes : listProductMes) {
                            if (productMes.getCourseType().equals(protypeall.getProductParentId())) {
                                com.music.demo.aliyunvideo.vo.returnvo.CourseRecommend cr = new com.music.demo.aliyunvideo.vo.returnvo.CourseRecommend();
                                PropertiesCopyUtil.copyProperties(productMes, cr, null);
                                listcr.add(cr);
                            }
                            if(productMes.getCourseType().equals("000001"))
                                break;

                        }
                        pdt.setCourseRecommend(listcr);
                        list.add(pdt);
                    }
                }


                pt.setListProductDatilType(list);
                listProductType.add(pt);
            }
        }
        proMes.setListProductType(listProductType);


        for (ProductMes pm : listProductMes) {
            if (!StringUtils.isEmpty(pm.getCourseTopOrder())) {
                com.music.demo.aliyunvideo.vo.returnvo.CourseRecommend pt = new com.music.demo.aliyunvideo.vo.returnvo.CourseRecommend();
                PropertiesCopyUtil.copyProperties(pm, pt, null);
                listCourseRecommend.add(pt);
            }

        }
        proMes.setListCourseRecommend(listCourseRecommend);
        return proMes;
    }


//
//    @Autowired
//    private PicListMapper picListMapper;
//    @Override
//    public String addPicList(PicList pic) {
//        picListMapper.insert(pic);
//        return null;
//    }
}
