// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.ConditionVariable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class cot extends AsyncTask
{

    private File a;
    private File b;
    private ConditionVariable c;

    public cot(File file, File file1, ConditionVariable conditionvariable)
    {
        a = file;
        b = file1;
        c = conditionvariable;
    }

    private transient Void a()
    {
        Object obj;
        byte abyte0[];
        abyte0 = null;
        Object obj1;
        Object obj2;
        Object obj3;
        int i;
        long l;
        long l1;
        try
        {
            if (b.exists())
            {
                b.delete();
            }
            obj1 = new BufferedOutputStream(new FileOutputStream(b));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            obj = null;
            obj1 = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
        }
        obj = new BufferedInputStream(new FileInputStream(a));
        obj3 = obj;
        obj2 = obj1;
        abyte0 = new byte[16384];
_L2:
        obj3 = obj;
        obj2 = obj1;
        i = ((BufferedInputStream) (obj)).read(abyte0);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = obj;
        obj2 = obj1;
        ((BufferedOutputStream) (obj1)).write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
        abyte0;
_L6:
        obj3 = obj;
        obj2 = obj1;
        eev.d("DumpDatabase", "Exception copying the database; destination may not be complete.", abyte0);
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                eev.d("DumpDatabase", "Caught exception closing file", ((Throwable) (obj1)));
            }
        }
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                eev.d("DumpDatabase", "Caught exception closing file", ((Throwable) (obj)));
            }
        }
        l = a.length();
        l1 = b.length();
        eev.e("DumpDatabase", (new StringBuilder(79)).append("Dump complete; orig size: ").append(l).append(", copy size: ").append(l1).toString());
        return null;
_L1:
        try
        {
            ((BufferedOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            eev.d("DumpDatabase", "Caught exception closing file", ((Throwable) (obj1)));
        }
        try
        {
            ((BufferedInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eev.d("DumpDatabase", "Caught exception closing file", ((Throwable) (obj)));
        }
        l = a.length();
        l1 = b.length();
        eev.e("DumpDatabase", (new StringBuilder(79)).append("Dump complete; orig size: ").append(l).append(", copy size: ").append(l1).toString());
        return null;
_L4:
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                eev.d("DumpDatabase", "Caught exception closing file", ((Throwable) (obj1)));
            }
        }
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                eev.d("DumpDatabase", "Caught exception closing file", ((Throwable) (obj1)));
            }
        }
        l = a.length();
        l1 = b.length();
        eev.e("DumpDatabase", (new StringBuilder(79)).append("Dump complete; orig size: ").append(l).append(", copy size: ").append(l1).toString());
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        abyte0 = ((byte []) (obj3));
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_40;
        abyte0;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

    public void onPostExecute(Object obj)
    {
        c.open();
    }
}
