import org.json.JSONException;


public class Main {
	public static String path = "";
	public static int mode = 11;
	
	public static String getJSON(int mode){
		switch (mode) {
		case 1: //ok
			path = "object";
			return "{object:text}";
		case 2: //ok
			path = "object.text";
			return "{object:{text:aaa}}";
		case 3: //ok
			//path = "object[1]";
			//return "{object:[aaa,bbb,ccc]}";
			//path = "object.array[1]";
			//return "{object:{array:[aaa,bbb,ccc]}}";
			path = "object.inner.array[1]";
			return "{object:{inner:{array:[aaa,bbb,ccc]}}}";
		case 4: //ok
			//path = "object[all]";
			//return "{object:[aaa,bbb,ccc]}";
			//path = "object.array[all]";
			//return "{object:{array:[aaa,bbb,ccc]}}";
			path = "object.inner.array[all]";
			return "{object:{inner:{array:[aaa,bbb,ccc]}}}";
		case 5: //ok
			//path = "object[0].text";
			//return "{object:[{text:aaa},{text:bbb},{text:ccc}]}";
			//path = "object[0].inner.text";
			//return "{object:[{inner:{text:aaa}},{inner:{text:bbb}},{inner:{text:ccc}}]}";
			path = "object.array[0].text";
			return "{object:{array:[{text:aaa},{text:bbb},{text:ccc}]}}";
		case 6: //ok
			//path = "object[all].text";
			//return "{object:[{text:aaa},{text:bbb},{text:ccc}]}";
			//path = "object[all].inner.text";
			//return "{object:[{inner:{text:aaa}},{inner:{text:bbb}},{inner:{text:ccc}}]}";
			path = "object.array[all].text";
			return "{object:{array:[{text:aaa},{text:bbb},{text:ccc}]}}";
		case 7: //ok
			//path = "object[0].array[1]";
			//return "{object:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}";
			//path = "object.inner[2].array[0]";
			//return "{object:{inner:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}";
			//path = "object.inner.outer[0].array[0]";
			//return "{object:{inner:{outer:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}}";
			//path = "object[0].inner.array[0]";
			//return "{object:[{inner:{array:[aaa,bbb]}},{inner:{array:[iii,jjj]}},{inner:{array:[xxx,yyy]}}]}";
			path = "object.inner[0].outer.array[0]";
			return "{object:{inner:[{outer:{array:[aaa,bbb]}},{outer:{array:[iii,jjj]}},{outer:{array:[xxx,yyy]}}]}}";
		case 8: //ok
			//path = "object[1].array[all]";
			//return "{object:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}";
			//path = "object.inner[1].array[all]";
			//return "{object:{inner:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}";
			//path = "object.inner.outer[1].array[all]";
			//return "{object:{inner:{outer:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}}";
			//path = "object[0].inner.array[all]";
			//return "{object:[{inner:{array:[aaa,bbb]}},{inner:{array:[iii,jjj]}},{inner:{array:[xxx,yyy]}}]}";
			path = "object.inner[0].outer.array[all]";
			return "{object:{inner:[{outer:{array:[aaa,bbb]}},{outer:{array:[iii,jjj]}},{outer:{array:[xxx,yyy]}}]}}";
		case 9: //ok
			//path = "object[all].array[0]"; //xxx
			//return "{object:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}";
			//path = "object.inner[all].array[1]";
			//return "{object:{inner:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}";
			//path = "object.inner.outer[all].array[0]";
			//return "{object:{inner:{outer:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}}";
			//path = "object[all].inner.array[1]";
			//return "{object:[{inner:{array:[aaa,bbb]}},{inner:{array:[iii,jjj]}},{inner:{array:[xxx,yyy]}}]}";
			path = "object.inner[all].outer.array[0]";
			return "{object:{inner:[{outer:{array:[aaa,bbb]}},{outer:{array:[iii,jjj]}},{outer:{array:[xxx,yyy]}}]}}";
		case 10: //ok
			//path = "object[all].array[all]";
			//return "{object:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}";
			//path = "object.inner[all].array[all]";
			//return "{object:{inner:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}";
			//path = "object.inner.outer[all].array[all]";
			//return "{object:{inner:{outer:[{array:[aaa,bbb]},{array:[iii,jjj]},{array:[xxx,yyy]}]}}}";
			//path = "object[all].inner.array[all]";
			//return "{object:[{inner:{array:[aaa,bbb]}},{inner:{array:[iii,jjj]}},{inner:{array:[xxx,yyy]}}]}";
			//path = "object.inner[all].outer.array[all]";
			//return "{object:{inner:[{outer:{array:[aaa,bbb]}},{outer:{array:[iii,jjj]}},{outer:{array:[xxx,yyy]}}]}}";
		case 11: //ok
			//path = "object[0].array[1].html";
			//return "{object:[{array:[{text:aaa},{html:htmla},bbb]},{array:[{text:iii},{html:htmli},jjj]},{array:[{text:xxx},{html:htmlx},yyy]}]}";
			//path = "object.inner[0].array[1].html";
			//return "{object:{inner:[{array:[{text:aaa},{html:htmla},bbb]},{array:[{text:iii},{html:htmli},jjj]},{array:[{text:xxx},{html:htmlx},yyy]}]}}";
			//path = "object.inner.outer[0].array[0].text";
			//return "{object:{inner:{outer:[{array:[{text:aaa},{html:htmla},bbb]},{array:[{text:iii},{html:htmli},jjj]},{array:[{text:xxx},{html:htmlx},yyy]}]}}}";
			//path = "object[0].inner.array[1].html";
			//return "{object:[{inner:{array:[{text:aaa},{html:htmla},bbb]}},{inner:{array:[{text:iii},{html:htmli},jjj]}},{inner:{array:[{text:xxx},{html:htmlx},yyy]}}]}";
			//path = "object.inner[2].outer.array[0].text";
			//return "{object:{inner:[{outer:{array:[{text:aaa},{html:htmla},bbb]}},{outer:{array:[{text:iii},{html:htmli},jjj]}},{outer:{array:[{text:xxx},{html:htmlx},yyy]}}]}}";
		case 12:
			//path = "object[1].array[all].text";
			//return "{object:[{array:[{text:aaa},{text:bbb},{text:ccc}]},{array:[{text:iii},{text:jjj},{text:kkk}]},{array:[{text:xxx},{text:yyy},{text:zzz}]}]}";
			//path = "object.inner[2].array[all].html";
			//return "{object:{inner:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}]}}";
			//path = "object.inner.outer[2].array[all].text";
			//return "{object:{inner:{outer:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}]}}}";
			//path = "object[0].inner.array[all].text"; //xxx
			//return "{object:[{inner:{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]}},{inner:{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]}},{inner:{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}}]}";
			path = "object.inner[1].outer.array[all].html";
			return "{object:{inner:[{outer:{array:[{text:aaa,html:htmla},{text:bbb,html:htmlb},{text:ccc}]}},{outer:{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]}},{outer:{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}}]}}";
		case 13:
			//path = "object[all].array[0].html";
			//return "{object:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx},{text:yyy},{text:zzz}]}]}";
			//path = "object.inner[all].array[0].html";
			//return "{object:{inner:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}]}}";
			//path = "object.inner.outer[all].array[2].html";
			//return "{object:{inner:{outer:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc,html:htmlc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}]}}}";
			//path = "object[all].inner.array[0].html"; //xxx
			//return "{object:[{inner:{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]}},{inner:{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]}},{inner:{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}}]}";
			path = "object.inner[all].outer.array[0].html";
			return "{object:{inner:[{outer:{array:[{text:aaa,html:htmla},{text:bbb,html:htmlb},{text:ccc}]}},{outer:{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]}},{outer:{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}}]}}";
		case 14:
			path = "object[all].array[all].html";
			return "{object:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx},{text:yyy},{text:zzz,html:htmlz}]}]}";
			//path = "object.inner[all].array[all].html";
			//return "{object:{inner:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}]}}";
			//path = "object.inner.outer[all].array[all].html";
			//return "{object:{inner:{outer:[{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc,html:htmlc}]},{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]},{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}]}}}";
			//path = "object[all].inner.array[all].html"; //xxx
			//return "{object:[{inner:{array:[{text:aaa,html:htmla},{text:bbb},{text:ccc}]}},{inner:{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]}},{inner:{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}}]}";
			//path = "object.inner[all].outer.array[all].text";
			//return "{object:{inner:[{outer:{array:[{text:aaa,html:htmla},{text:bbb,html:htmlb},{text:ccc}]}},{outer:{array:[{text:iii,html:htmli},{text:jjj},{text:kkk}]}},{outer:{array:[{text:xxx,html:htmlx},{text:yyy},{text:zzz}]}}]}}";
		default:
			
			return "null";
		}
		
		//object[all].array[all].text

	}
	
	public static void main(String[] args) throws JSONException{
		JsonParser jparser = new JsonParser(getJSON(14));
		System.out.println("\n"+jparser.getArrayString(path));
		System.out.println();
		System.out.println(path);
		System.out.println(jparser.JsonObject.toString(3));
	}

}
