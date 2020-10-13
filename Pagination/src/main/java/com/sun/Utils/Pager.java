package com.sun.Utils;

import com.github.pagehelper.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Pager<T> {
//        分页大小
        private  int size;
//        当前页
        private  int offset;
//        总记录数
        private  long total;
//        分页的数据
        private List<T> datas;

        public Pager(List<T> datas){
//                将分页拿到的数据转换为Page对象
                if(datas instanceof Page){
                        Page<T> page = (Page<T>)datas;
                        setOffset(page.getPageNum());   //设置起始页
                        setSize(page.getPageSize());    //设置每页容量
                        setTotal(page.getTotal());
                        setDatas(datas);
                }
        }
}
