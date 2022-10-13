package org.zerock.spring1.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MemberWrapper {

    private List<Member> arr;
}
