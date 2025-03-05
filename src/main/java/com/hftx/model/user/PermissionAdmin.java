package com.hftx.model.user;

public interface PermissionAdmin {
    /*
    * --- Gerenciamento do Album ---
    * */
    void add_hero();
    void add_villain();
    void delete_hero();
    void delete_villain();
    void edit_hero();
    void edit_villain();

    /*
    * Operações de Sistema
    * */
    void setAdmin();
}
