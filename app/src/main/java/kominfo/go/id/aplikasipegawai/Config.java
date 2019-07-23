package kominfo.go.id.aplikasipegawai;

public class Config {
//    Ini isi untuk configurasi android studio agar bisa menambah, mengedit, membaca, serta
//    mengapus data menggunakan mysql

    public static final String URL_BASE = "http://192.168.43.124";
    public static final String URL_ADD = URL_BASE + "tambahpgw.php";
    public static final String URL_GET_ALL = URL_BASE + "tampilsemuapgw.php";
    public static final String URL_GET_EMP = URL_BASE + "tampilpgw.php";
    public static final String URL_UPDATE_EMP = URL_BASE + "updatepgw.php";
    public static final String URL_DELETE_EMP = URL_BASE + "hapuspgw.php";

//    Ini adalah key untuk mengirim request data php
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; // Ini adalah variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; // Ini adalah variabel untuk gajih

//    JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

//    ID Karyawan/emp(employee)
    public static final String EMP_ID = "emp_id";
}
