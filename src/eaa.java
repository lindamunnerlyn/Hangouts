// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.PowerManager;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class eaa
{

    private static final String a = System.getProperty("line.separator");
    private static final String b;
    private static final SimpleDateFormat p;
    private String c;
    private String d;
    private long e;
    private long f;
    private boolean g;
    private String h;
    private int i;
    private boolean j;
    private int k;
    private String l;
    private String m;
    private String n;
    private int o;

    public eaa()
    {
        a();
    }

    static String a(eaa eaa1)
    {
        eaa1.g = dzy.d().isScreenOn();
        Object obj;
        if (dzy.e() != null)
        {
            obj = dzy.e();
        } else
        {
            obj = "--";
        }
        eaa1.h = ((String) (obj));
        if (eaa1.e == -1L)
        {
            eaa1.e = System.currentTimeMillis();
        }
        obj = new StringBuilder();
        if (eaa1.c == null)
        {
            ebw.g("Babel", "null datatype in DataLog.build");
            eaa1.c = "(unknown)";
        }
        ((StringBuilder) (obj)).append(p.format(new Date(eaa1.e))).append("(").append(eaa1.e).append("),").append(eaa1.c).append(",").append(eaa1.d).append(",").append(eaa1.f).append(",").append(eaa1.g).append(",").append(eaa1.h).append(",").append(eaa1.i).append(",").append(eaa1.j).append(",").append(eaa1.k).append(",").append(eaa1.l).append(",").append(eaa1.o).append(",").append(eaa1.n).append(",").append(eaa1.m).append(a);
        return ((StringBuilder) (obj)).toString();
    }

    static String c()
    {
        return b;
    }

    public eaa a()
    {
        c = null;
        d = "";
        e = -1L;
        f = -1L;
        g = false;
        h = "";
        i = -1;
        j = false;
        k = -1;
        l = "";
        m = "";
        n = "";
        o = 0;
        return this;
    }

    public eaa a(int i1)
    {
        i = i1;
        return this;
    }

    public eaa a(long l1)
    {
        e = l1;
        return this;
    }

    public eaa a(ani ani1)
    {
        m = ani1.b().toString();
        n = ani1.a();
        return this;
    }

    public eaa a(cey cey1)
    {
        m = cey1.toString();
        return this;
    }

    public eaa a(String s)
    {
        c = s;
        return this;
    }

    public eaa a(boolean flag)
    {
        j = flag;
        return this;
    }

    public eaa b(int i1)
    {
        k = i1;
        return this;
    }

    public eaa b(long l1)
    {
        f = l1;
        return this;
    }

    public eaa b(String s)
    {
        if (TextUtils.isEmpty(d))
        {
            d = s;
            return this;
        } else
        {
            d = d.concat(";").concat(s);
            return this;
        }
    }

    public void b()
    {
        dzy.a(this);
    }

    public eaa c(int i1)
    {
        o = i1;
        return this;
    }

    public eaa c(String s)
    {
        l = s;
        return this;
    }

    public eaa d(String s)
    {
        n = s;
        return this;
    }

    static 
    {
        String s = String.valueOf("date,logType,extraData,messageTime,screenOn,activity,activeClient,notificationLevel,conversationId,sizeInBytes,accountName,accountID");
        String s1 = String.valueOf(a);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        b = s;
        p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
    }
}
