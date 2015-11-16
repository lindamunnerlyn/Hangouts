// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.net.Uri;

public final class gmn
{

    private itv A;
    private String a;
    private String b;
    private int c;
    private int d;
    private String e;
    private lch f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private Uri o;
    private String p;
    private String q;
    private String r;
    private String s;
    private Notification t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private byte z[];

    public gmn()
    {
        c = 51;
        d = 3;
        v = true;
        w = true;
    }

    public gmn a(int i1)
    {
        c = i1;
        return this;
    }

    public gmn a(Notification notification)
    {
        t = notification;
        return this;
    }

    public gmn a(Uri uri)
    {
        o = uri;
        return this;
    }

    public gmn a(itv itv1)
    {
        A = itv1;
        return this;
    }

    public gmn a(String s1)
    {
        a = s1;
        return this;
    }

    public gmn a(lch lch)
    {
        f = lch;
        return this;
    }

    public gmn a(boolean flag)
    {
        u = flag;
        return this;
    }

    public gmn a(byte abyte0[])
    {
        z = abyte0;
        return this;
    }

    public String a()
    {
        return a;
    }

    public gmn b(int i1)
    {
        d = i1;
        return this;
    }

    public gmn b(String s1)
    {
        b = s1;
        return this;
    }

    public gmn b(boolean flag)
    {
        v = flag;
        return this;
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public gmn c(String s1)
    {
        h = s1;
        if (i != null || m != null || n != null || k != null || o != null)
        {
            throw new IllegalArgumentException("Setting the resolved id is incompatible with resolving.");
        } else
        {
            return this;
        }
    }

    public gmn c(boolean flag)
    {
        x = flag;
        return this;
    }

    public gmn d(String s1)
    {
        k = s1;
        return this;
    }

    public gmn d(boolean flag)
    {
        y = flag;
        return this;
    }

    public lch d()
    {
        return f;
    }

    public int e()
    {
        return d;
    }

    public gmn e(String s1)
    {
        l = s1;
        return this;
    }

    public gmn f(String s1)
    {
        i = s1;
        return this;
    }

    public String f()
    {
        return h;
    }

    public gmn g(String s1)
    {
        j = s1;
        return this;
    }

    public String g()
    {
        return k;
    }

    public gmn h(String s1)
    {
        m = s1;
        return this;
    }

    public String h()
    {
        return l;
    }

    public gmn i(String s1)
    {
        n = s1;
        return this;
    }

    public String i()
    {
        return i;
    }

    public gmn j(String s1)
    {
        p = s1;
        return this;
    }

    public String j()
    {
        return j;
    }

    public gmn k(String s1)
    {
        q = s1;
        return this;
    }

    public String k()
    {
        return m;
    }

    public gmn l(String s1)
    {
        r = s1;
        return this;
    }

    public String l()
    {
        return n;
    }

    public Uri m()
    {
        return o;
    }

    public gmn m(String s1)
    {
        e = s1;
        return this;
    }

    public gmn n(String s1)
    {
        s = s1;
        return this;
    }

    public String n()
    {
        return p;
    }

    public String o()
    {
        return q;
    }

    public String p()
    {
        return r;
    }

    public String q()
    {
        return e;
    }

    public String r()
    {
        return s;
    }

    public Notification s()
    {
        return t;
    }

    public boolean t()
    {
        return u;
    }

    public String toString()
    {
        String s1;
        StringBuilder stringbuilder;
        int i1;
        if (z == null)
        {
            i1 = 0;
        } else
        {
            i1 = z.length;
        }
        stringbuilder = (new StringBuilder("CallInfo:\n sessionId: ")).append(a).append("\n resolvedHangoutId: ").append(h).append("\n domain: ").append(i).append("\n roomName: ").append(j).append("\n calendarId: ").append(m).append("\n eventId: ").append(n).append("\n externalKeyName: ").append(k).append("\n externalKeyId: ").append(l).append("\n originalUri: ").append(o).append("\n accountName: ").append(p).append("\n clientId: ").append(q).append("\n gcmRegistration: ").append(r).append("\n compressedLogFile: ").append(e).append("\n hasVideo: ").append(u).append("\n shouldManagePlatformInteraction: ").append(v).append("\n isUserMinor: ").append(x).append("\n isOnAirAllowed: ").append(y).append("\n userLocationBytes is ");
        if (z == null)
        {
            s1 = "";
        } else
        {
            s1 = "not ";
        }
        return stringbuilder.append(s1).append("null\n userLocationBytes length: ").append(i1).append("\n videoCallOptions: ").append(A).toString();
    }

    public boolean u()
    {
        return v;
    }

    public boolean v()
    {
        return x;
    }

    public boolean w()
    {
        return y;
    }

    public byte[] x()
    {
        return z;
    }

    public boolean y()
    {
        return g;
    }

    public itv z()
    {
        if (A == null)
        {
            A = new itv();
        }
        return A;
    }
}
