package com.fast.family.commons.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张顺
 * @version 1.0
 * @created 2018/10/7-9:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pageble {

    private int page = 1;

    private int size = 10;
}
