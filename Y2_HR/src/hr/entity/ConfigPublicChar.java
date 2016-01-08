package hr.entity;

/**
 * ¹«¹²×Ö¶Î ±í
 * @author Eung-yuong Liu
 *
 */
public class ConfigPublicChar {
    private Integer id;

    private String attributeKind;

    private String attributeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttributeKind() {
        return attributeKind;
    }

    public void setAttributeKind(String attributeKind) {
        this.attributeKind = attributeKind == null ? null : attributeKind.trim();
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }
}