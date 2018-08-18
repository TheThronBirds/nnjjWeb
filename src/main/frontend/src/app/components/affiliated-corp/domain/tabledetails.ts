export class tabledetails{
    tableName?: String;
    chName?: String;
    chShortName?:String;
    table_type?: number;
    primaryKey?: String;
    uniqueIndex?: String;
    details?: String;
    constructor(tableName:String){
        this.chName = "";
        this.chShortName="";
        this.details="";
        this.primaryKey="";
        this.table_type=1;
        this.tableName=tableName;
        this.uniqueIndex="";
    }
}