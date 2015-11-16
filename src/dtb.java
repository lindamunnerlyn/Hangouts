// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class dtb
{

    private static final ExecutorService a;
    private static final Runnable b = new dtd();

    public static void a()
    {
        if (!dcn.j())
        {
            return;
        } else
        {
            a.execute(b);
            return;
        }
    }

    private static void a(int i)
    {
        ((dup)hlp.a(g.nU, dup)).a(i);
    }

    private static void a(SQLiteDatabase sqlitedatabase, List list)
    {
        Context context = g.nU;
        anh.b(sqlitedatabase);
        anh.d(sqlitedatabase);
        dtp.b(context);
        anh.a(sqlitedatabase, list);
        a(context.getResources().getInteger(g.eT));
    }

    private static boolean a(SQLiteDatabase sqlitedatabase, File file, int i, List list)
    {
        eev.e("Babel_SMS", (new StringBuilder(38)).append("ApnsOta.loadUpdate version ").append(i).toString());
        FileInputStream fileinputstream1;
        Object obj;
        anh.c(sqlitedatabase);
        obj = XmlPullParserFactory.newInstance().newPullParser();
        fileinputstream1 = new FileInputStream(file);
        FileInputStream fileinputstream = fileinputstream1;
        ((XmlPullParser) (obj)).setInput(new InputStreamReader(new GZIPInputStream(fileinputstream1)));
        fileinputstream = fileinputstream1;
        obj = dtg.a(((XmlPullParser) (obj)));
        fileinputstream = fileinputstream1;
        ((dtg) (obj)).a(new dte(sqlitedatabase));
        fileinputstream = fileinputstream1;
        ((dtg) (obj)).a(new dtf(new ContentValues(), sqlitedatabase));
        fileinputstream = fileinputstream1;
        ((dtg) (obj)).a();
        fileinputstream = fileinputstream1;
        anh.a(sqlitedatabase, list);
        fileinputstream = fileinputstream1;
        dtp.b(g.nU);
        fileinputstream = fileinputstream1;
        a(i);
        try
        {
            fileinputstream1.close();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            file = String.valueOf(sqlitedatabase);
            eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 41)).append("ApnsOta.loadUpdate: file closing failure ").append(file).toString(), sqlitedatabase);
        }
        return true;
        sqlitedatabase;
        fileinputstream1 = null;
_L7:
        fileinputstream = fileinputstream1;
        file = String.valueOf(sqlitedatabase);
        fileinputstream = fileinputstream1;
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 37)).append("ApnsOta.loadUpdate: XML parser error ").append(file).toString(), sqlitedatabase);
        if (fileinputstream1 != null)
        {
            try
            {
                fileinputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                file = String.valueOf(sqlitedatabase);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 41)).append("ApnsOta.loadUpdate: file closing failure ").append(file).toString(), sqlitedatabase);
            }
        }
_L1:
        return false;
        sqlitedatabase;
        fileinputstream1 = null;
_L5:
        fileinputstream = fileinputstream1;
        file = String.valueOf(file);
        fileinputstream = fileinputstream1;
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 33)).append("ApnsOta.loadUpdate: can not find ").append(file).toString(), sqlitedatabase);
        if (fileinputstream1 != null)
        {
            try
            {
                fileinputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                file = String.valueOf(sqlitedatabase);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 41)).append("ApnsOta.loadUpdate: file closing failure ").append(file).toString(), sqlitedatabase);
            }
        }
          goto _L1
        sqlitedatabase;
        fileinputstream1 = null;
_L4:
        fileinputstream = fileinputstream1;
        file = String.valueOf(sqlitedatabase);
        fileinputstream = fileinputstream1;
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 31)).append("ApnsOta.loadUpdate: io failure ").append(file).toString(), sqlitedatabase);
        if (fileinputstream1 != null)
        {
            try
            {
                fileinputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                file = String.valueOf(sqlitedatabase);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 41)).append("ApnsOta.loadUpdate: file closing failure ").append(file).toString(), sqlitedatabase);
            }
        }
          goto _L1
        sqlitedatabase;
        fileinputstream = null;
_L3:
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                list = String.valueOf(file);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(list).length() + 41)).append("ApnsOta.loadUpdate: file closing failure ").append(list).toString(), file);
            }
        }
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L3; else goto _L2
_L2:
        sqlitedatabase;
          goto _L4
        sqlitedatabase;
          goto _L5
        sqlitedatabase;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean a(File file)
    {
        SQLiteDatabase sqlitedatabase = anh.a(g.nU);
        return a(sqlitedatabase, file, 99, anh.a(sqlitedatabase));
    }

    private static boolean a(String s, File file)
    {
        Object obj3;
        Object obj5;
        obj5 = null;
        obj3 = null;
        Object obj = String.valueOf(s);
        int i;
        if (((String) (obj)).length() != 0)
        {
            obj = "ApnsOta: download new update ".concat(((String) (obj)));
        } else
        {
            obj = new String("ApnsOta: download new update ");
        }
        eev.e("Babel_SMS", ((String) (obj)));
        obj = String.valueOf(g.a(g.nU, "babel_apn_ota_url_prefix", "https://www.gstatic.com/android/hangouts"));
        obj = new URL((new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(s).length())).append(((String) (obj))).append("/").append(s).toString());
        s = String.valueOf(obj);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 24)).append("ApnsOta.downloadUpdate: ").append(s).toString());
        s = (HttpsURLConnection)((URL) (obj)).openConnection();
        s.connect();
        if (s.getResponseCode() == 200)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        file = String.valueOf(obj);
        i = s.getResponseCode();
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 63)).append("ApnsOta.downloadUpdate: failed to connect").append(file).append(", response=").append(i).toString());
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                file = String.valueOf(s);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 51)).append("ApnsOta.downloadUpdate: io error in closing stream ").append(file).toString(), s);
            }
        }
        return false;
        Object obj1;
        Object obj2;
        Exception exception;
        int j;
        int k;
        int l;
        try
        {
            k = s.getContentLength();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            file = null;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            obj2 = null;
            file = s;
            s = ((String) (obj3));
            continue; /* Loop/switch isn't completed */
        }
        if (k > 0)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        eev.g("Babel_SMS", (new StringBuilder(58)).append("ApnsOta.downloadUpdate: invalid content length ").append(k).toString());
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                file = String.valueOf(s);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 51)).append("ApnsOta.downloadUpdate: io error in closing stream ").append(file).toString(), s);
            }
        }
        return false;
        obj2 = s.getInputStream();
        try
        {
            obj1 = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            file = ((File) (obj2));
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            file = s;
            s = ((String) (obj3));
            continue; /* Loop/switch isn't completed */
        }
        file = new byte[4096];
        j = 0;
_L2:
        l = ((InputStream) (obj2)).read(file, 0, 4096);
        if (l <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((OutputStream) (obj1)).write(file, 0, l);
        j += l;
        if (true) goto _L2; else goto _L1
_L1:
        if (j == k)
        {
            break MISSING_BLOCK_LABEL_542;
        }
        eev.g("Babel_SMS", (new StringBuilder(59)).append("ApnsOta.downloadUpdate: incomplete: ").append(j).append("/").append(k).toString());
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        ((InputStream) (obj2)).close();
        ((OutputStream) (obj1)).close();
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                file = String.valueOf(s);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 51)).append("ApnsOta.downloadUpdate: io error in closing stream ").append(file).toString(), s);
            }
        }
        return false;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        ((InputStream) (obj2)).close();
        ((OutputStream) (obj1)).close();
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                file = String.valueOf(s);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 51)).append("ApnsOta.downloadUpdate: io error in closing stream ").append(file).toString(), s);
            }
        }
        return true;
        obj1;
        s = null;
        file = null;
        obj2 = obj3;
_L6:
        obj3 = String.valueOf(obj1);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj3).length() + 33)).append("ApnsOta.downloadUpdate: io error ").append(((String) (obj3))).toString(), ((Throwable) (obj1)));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_669;
        }
        file.close();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        ((OutputStream) (obj2)).close();
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                file = String.valueOf(s);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(file).length() + 51)).append("ApnsOta.downloadUpdate: io error in closing stream ").append(file).toString(), s);
            }
        }
        return false;
        s;
        obj1 = null;
        obj2 = null;
        file = obj5;
_L4:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_748;
        }
        ((InputStream) (obj2)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_756;
        }
        ((OutputStream) (obj1)).close();
        if (file != null)
        {
            try
            {
                file.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                obj1 = String.valueOf(file);
                eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 51)).append("ApnsOta.downloadUpdate: io error in closing stream ").append(((String) (obj1))).toString(), file);
            }
        }
        throw s;
        obj3;
        file = s;
        s = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        exception;
        obj3 = file;
        obj1 = obj2;
        file = s;
        s = exception;
        obj2 = obj3;
        if (true) goto _L4; else goto _L3
        IOException ioexception;
        ioexception;
        file = ((File) (obj1));
        Object obj4 = obj2;
        obj1 = ioexception;
        obj2 = file;
        file = ((File) (obj4));
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void b()
    {
        Object obj1 = g.nU;
        String s = g.a(g.nU, "babel_apn_ota_file_prefix", "apnota-");
        String s1 = g.a(g.nU, "babel_apn_ota_file_suffix", ".xml.gz");
        int i = g.a(g.nU, "babel_apn_ota_version", -1);
        eev.e("Babel_SMS", (new StringBuilder(32)).append("ApnsOta: OTA version ").append(i).toString());
        Object obj = (dup)hlp.a(((Context) (obj1)), dup);
        int j = ((dup) (obj)).e();
        int k = ((dup) (obj)).d();
        obj = anh.a(((Context) (obj1)));
        if (i > k)
        {
            s = String.format(Locale.US, "%s%d%s", new Object[] {
                s, Integer.valueOf(i), s1
            });
            obj1 = String.valueOf(((Context) (obj1)).getFilesDir());
            obj1 = new File((new StringBuilder(String.valueOf(obj1).length() + 1 + String.valueOf(s).length())).append(((String) (obj1))).append("/").append(s).toString());
            if (a(s, ((File) (obj1))))
            {
                List list = anh.a(((SQLiteDatabase) (obj)));
                if (!a(((SQLiteDatabase) (obj)), ((File) (obj1)), i, list))
                {
                    eev.e("Babel_SMS", "ApnsOta: revert to defaults because of failure");
                    a(((SQLiteDatabase) (obj)), list);
                }
            }
            ((File) (obj1)).delete();
        } else
        if (i == -1 && k != j)
        {
            eev.e("Babel_SMS", "ApnsOta: forced to load defaults");
            a(((SQLiteDatabase) (obj)), anh.a(((SQLiteDatabase) (obj))));
            return;
        }
    }

    static 
    {
        g.a(g.nU).a(new dtc());
        a = new ThreadPoolExecutor(0, 1, 60000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2));
    }
}
