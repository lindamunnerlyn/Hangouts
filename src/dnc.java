// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import java.io.File;

public abstract class dnc extends dlt
{

    final boolean a;
    public eap b;
    final String d;
    dnd e;
    private final Object f;

    public dnc(boolean flag, eap eap1, String s, Object obj)
    {
        f = obj;
        a = flag;
        b = eap1;
        d = s;
    }

    public abstract dnb a(byte abyte0[]);

    public abstract void a(dnb dnb);

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

    public abstract dms c_();

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public File j()
    {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public Object l()
    {
        return f;
    }

    public String m()
    {
        return b.o();
    }

    public eap n()
    {
        return b;
    }

    public boolean o()
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
        flag1 = k();
        flag2 = a();
        return (new StringBuilder(String.valueOf(s1).length() + 69 + String.valueOf(s).length())).append(s1).append(" MediaUrl:").append(s).append(" cacheable=").append(flag).append(" cancelled=").append(flag1).append(" shouldUseLoaderQueue=").append(flag2).toString();
    }
}
