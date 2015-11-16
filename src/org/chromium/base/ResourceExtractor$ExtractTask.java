// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

// Referenced classes of package org.chromium.base:
//            ResourceExtractor

class ception extends AsyncTask
{

    final ResourceExtractor a;
    private final List b;

    private String a(File file)
    {
        Object obj = ResourceExtractor.c(a).getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(ResourceExtractor.c(a).getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return "pak_timestamp-";
        }
        if (obj == null)
        {
            file = "pak_timestamp-";
        } else
        {
            obj = (new StringBuilder("pak_timestamp-")).append(((PackageInfo) (obj)).versionCode).append("-").append(((PackageInfo) (obj)).lastUpdateTime).toString();
            class _cls1
                implements FilenameFilter
            {

                final ResourceExtractor.ExtractTask a;

                public boolean accept(File file1, String s)
                {
                    return s.startsWith("pak_timestamp-");
                }

            _cls1()
            {
                a = ResourceExtractor.ExtractTask.this;
                super();
            }
            }

            String as[] = file.list(new _cls1());
            file = ((File) (obj));
            if (as.length == 1)
            {
                file = ((File) (obj));
                if (((String) (obj)).equals(as[0]))
                {
                    return null;
                }
            }
        }
        return file;
    }

    private static void a(InputStream inputstream, File file, byte abyte0[])
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        (new StringBuilder("Extracting resource ")).append(file);
_L3:
        int i = inputstream.read(abyte0, 0, 16384);
        if (i == -1) goto _L2; else goto _L1
_L1:
        fileoutputstream.write(abyte0, 0, i);
          goto _L3
        abyte0;
        file = fileoutputstream;
_L5:
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        inputstream.close();
        if (file != null)
        {
            file.close();
        }
        throw abyte0;
_L2:
        fileoutputstream.flush();
        if (file.length() == 0L)
        {
            throw new IOException((new StringBuilder()).append(file).append(" extracted with 0 length!").toString());
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        inputstream.close();
        fileoutputstream.close();
        return;
        inputstream;
        fileoutputstream.close();
        throw inputstream;
        inputstream;
        if (file != null)
        {
            file.close();
        }
        throw inputstream;
        abyte0;
        file = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void a(String s)
    {
        if (android.os.ctTask < 18)
        {
            return;
        } else
        {
            Trace.beginSection(s);
            return;
        }
    }

    private static void c()
    {
        if (android.os.ctTask < 18)
        {
            return;
        } else
        {
            Trace.endSection();
            return;
        }
    }

    protected transient Void a()
    {
        a("ResourceExtractor.ExtractTask.doInBackground");
        Object obj = ResourceExtractor.a(a);
        if (((File) (obj)).exists() || ((File) (obj)).mkdirs()) goto _L2; else goto _L1
_L1:
        Log.e("ResourceExtractor", "Unable to create pak resources directory!");
_L6:
        c();
        return null;
_L2:
        a("checkPakTimeStamp");
        String s = a(((File) (obj)));
        c();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ResourceExtractor.b(a);
        byte abyte0[];
        a("WalkAssets");
        abyte0 = new byte[16384];
        y ay[];
        int j;
        ay = ResourceExtractor.a();
        j = ay.length;
        int i = 0;
_L4:
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ay[i];
        File file;
        file = new File(((File) (obj)), ((y) (obj1)).b);
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        a("ExtractResource");
        obj1 = ResourceExtractor.c(a).getResources().openRawResource(((y) (obj1)).a);
        a(((InputStream) (obj1)), file, abyte0);
        c();
        i++;
        if (true) goto _L4; else goto _L3
        obj;
        c();
        throw obj;
        obj;
        Exception exception;
        try
        {
            c();
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        (new StringBuilder("Exception unpacking required pak resources: ")).append(((IOException) (obj)).getMessage());
        ResourceExtractor.b(a);
        c();
        continue; /* Loop/switch isn't completed */
_L3:
        c();
        if (s != null)
        {
            try
            {
                (new File(((File) (obj)), s)).createNewFile();
            }
            catch (IOException ioexception) { }
            finally
            {
                c();
                throw obj;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        c();
        throw exception;
    }

    protected void b()
    {
        int i;
        a("ResourceExtractor.ExtractTask.onPostExecute");
        i = 0;
_L2:
        if (i >= b.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((Runnable)b.get(i)).run();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        b.clear();
        c();
        return;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected void onPostExecute(Object obj)
    {
        b();
    }
}
