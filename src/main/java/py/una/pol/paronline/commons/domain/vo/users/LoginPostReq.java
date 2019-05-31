/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.vo.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author dlopez
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginPostReq {
    
    @JsonProperty(value = "login_name")
    private String loginName;
    @JsonProperty(value = "passwd")
    private String passwd;
}
