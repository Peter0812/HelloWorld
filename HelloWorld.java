//單行註解
//檔名：HelloWorld.java

//套件區


//import區



//類別區
//主類別
public class HelloWorld{
	//主方法：程式進入點
	public static void main(String[] args){
		//敘述句 
		System.out.println("Hello! World!");
		System.out.println("Hi! "+args[0]);
		System.out.println(args[1]);
	}	
}

//一般類別



/*

	多行註解
    不可以寫巢狀註解

    1.命名規則：
      A.符號 A~Z a~z 0~9 _(底線) $  <<數字不可以是第一個符號 如：6test>>
        合法命名： Hello ,id ,$name ,C_TABLE01
      B.套件 com.gjun.sample
      C.類別、介面  Hello    HelloWorld 
      D.方法、變數  name   setName  getUserName
      E.常數  PI  USER_TABLE  
	
	2.程式說明：
		package 管理分類類別，用來宣告該檔案中的類別是屬於哪一個Package(類別庫)，必須寫在程式的第一行

		import 引用現成API或廠商或自己開發類別，必須先宣告在import區，讓編譯器找到這些類別所在的位置
		
		類別：
			[語法] 封裝等級 class 類別名稱{...}
				public 存取修飾字，表示公開用
				class 關鍵字
				HelloWorld 類別名稱
				[注意]：類別若宣告public，則存檔時的主檔名必須與類別名稱相同
						一個java檔案可以有多的類別宣告，但只有一個可以宣告public
		主方法：
			[語法] public static void main(String[] args){...}
				main 方法名稱
				static 代表main方法直接載入至Global記憶體被執行
				void 代表方法無回傳值
				String[] args 方法參數列：String[] 字串陣列，args 陣列名稱，在此用來接收命令列傳入的參數
	
		敘述句：必須使用分號(;)結束
		
	3.編譯/執行
		[編譯]
       	    c:\workspace-0211>javac HelloWorld.java
       
		[執行]
            c:\workspace-0211>java HelloWorld

*/


