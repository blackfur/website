package com.fakeghost.bbs.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Post {
    private long id;
    private String title;
    private String author;
    private String content;
    private String createTime;
    private String category;

    @Override
    public String toString() {
            return "<tr>"+
            "<td class='td1' style='text-align: center'>"+id+"</td>"+
            "<td class='td1' style='text-align: center'>"+author+"</td>"+
            "<td class='td1' style='text-align: center'>"+createTime+"</td>"+
            "<td class='td1' style='text-align: center'>"+category+"</td>"+
            "<td class='td1' style='text-align: center'><a href='/BBS/read.jsp?id="+id+"'>"+title+"</a></td>"+
            "</tr>";
    }
}