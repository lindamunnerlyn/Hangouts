// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.PowerManager;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class ede
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

    public ede()
    {
        a();
    }

    static String a(ede ede1)
    {
        ede1.g = edc.d().isScreenOn();
        Object obj;
        if (edc.e() != null)
        {
            obj = edc.e();
        } else
        {
            obj = "--";
        }
        ede1.h = ((String) (obj));
        if (ede1.e == -1L)
        {
            ede1.e = System.currentTimeMillis();
        }
        obj = new StringBuilder();
        if (ede1.c == null)
        {
            eev.g("Babel", "null datatype in DataLog.build");
            ede1.c = "(unknown)";
        }
        ((StringBuilder) (obj)).append(p.format(new Date(ede1.e))).append("(").append(ede1.e).append("),").append(ede1.c).append(",").append(ede1.d).append(",").append(ede1.f).append(",").append(ede1.g).append(",").append(ede1.h).append(",").append(ede1.i).append(",").append(ede1.j).append(",").append(ede1.k).append(",").append(ede1.l).append(",").append(ede1.o).append(",").append(ede1.n).append(",").append(ede1.m).append(a);
        return ((StringBuilder) (obj)).toString();
    }

    static String c()
    {
        return b;
    }

    public ede a()
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

    public ede a(int i1)
    {
        i = i1;
        return this;
    }

    public ede a(long l1)
    {
        e = l1;
        return this;
    }

    public ede a(aoa aoa1)
    {
        m = aoa1.b().toString();
        n = aoa1.a();
        return this;
    }

    public ede a(cgd cgd1)
    {
        m = cgd1.toString();
        return this;
    }

    public ede a(String s)
    {
        c = s;
        return this;
    }

    public ede a(boolean flag)
    {
        j = flag;
        return this;
    }

    public ede b(int i1)
    {
        k = i1;
        return this;
    }

    public ede b(long l1)
    {
        f = l1;
        return this;
    }

    public ede b(String s)
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
        edc.a(this);
    }

    public ede c(int i1)
    {
        o = i1;
        return this;
    }

    public ede c(String s)
    {
        l = s;
        return this;
    }

    public ede d(String s)
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
