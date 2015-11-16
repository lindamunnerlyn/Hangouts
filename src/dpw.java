// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import java.io.File;

public abstract class dpw extends dor
{

    final boolean a;
    public edt b;
    final String d;
    dpx e;
    private final Object f;

    public dpw(boolean flag, edt edt1, String s, Object obj)
    {
        f = obj;
        a = flag;
        b = edt1;
        d = s;
    }

    public abstract dpv a(byte abyte0[]);

    public abstract void a(dpv dpv);

    public void a(String s)
    {
    }

    public boolean a()
    {
        return true;
    }

    public String c()
    {
        return b.s();
    }

    public abstract dpm d_();

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public File k()
    {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public Object m()
    {
        return f;
    }

    public String n()
    {
        return b.o();
    }

    public edt o()
    {
        return b;
    }

    public boolean p()
    {
        return a;
    }

    public String toString()
    {
        String s1 = String.valueOf(super.toString());
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (b == null)
        {
            s = " None";
        } else
        {
            s = b.toString();
        }
        flag = f();
        flag1 = l();
        flag2 = a();
        return (new StringBuilder(String.valueOf(s1).length() + 69 + String.valueOf(s).length())).append(s1).append(" MediaUrl:").append(s).append(" cacheable=").append(flag).append(" cancelled=").append(flag1).append(" shouldUseLoaderQueue=").append(flag2).toString();
    }
}
