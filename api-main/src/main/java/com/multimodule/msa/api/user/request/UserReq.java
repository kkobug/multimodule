package com.multimodule.msa.api.user.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {

    private String username;

    private String domain;

    private String nickname;

}
