package com.abdel.git_actions.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author abdel-maliki
 * Date : 14/03/2020
 */
@Entity()
@Table()
@Data
public class User {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String password;
}
