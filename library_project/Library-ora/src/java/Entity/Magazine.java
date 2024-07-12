/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;

/**
 *
 * @author The user
 */
@Entity
public class Magazine extends Item{
    private String mainEditor;
    private String month;

    public Magazine(String name,String mainEditor,String month) {
        super(name);
        this.mainEditor= mainEditor;
        this.month=month;
    }

    public Magazine() {
    }

    public String getMainEditor() {
        return mainEditor;
    }

    public void setMainEditor(String mainEditor) {
        this.mainEditor = mainEditor;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
    
    
    
}
