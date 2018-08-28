package com.chandler.zsk.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Slf4j
@NoArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class User {
    private int id;
    @NonNull private String name;
    private String password;
    private String salt;
    private String headUrl;

}
