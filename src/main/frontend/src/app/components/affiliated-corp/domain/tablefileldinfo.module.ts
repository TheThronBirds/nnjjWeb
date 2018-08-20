export class tablefieldinfo{
    tableName?:String;
    name?:String;
    enumRemark?:String;
    remark?:String;
    business?:String;

    constructor(tableName: String,name: String,enumRemark?:String,remark?:String,business?:String){
        this.tableName = tableName;
        this.name = name;

        if(enumRemark == ""||enumRemark == null){
            this.enumRemark= "空";
        }else{
            this.enumRemark = enumRemark;
        }

        if(remark == ""||remark == null){
            this.remark= "空";
        }else{
            this.remark = remark;
        }

        if(business == ""||business == null){
            this.business= "空";
        }else{
            this.business = business;
        }

    }
}