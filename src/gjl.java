// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.net.Uri;

public final class gjl
{

    private byte A[];
    private inq B;
    private String a;
    private String b;
    private int c;
    private int d;
    private String e;
    private kuf f;
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
    private boolean z;

    public gjl()
    {
        c = 51;
        d = 3;
        v = true;
        w = true;
    }

    public inq A()
    {
        if (B == null)
        {
            B = new inq();
        }
        return B;
    }

    public gjl a(int i1)
    {
        c = i1;
        return this;
    }

    public gjl a(Notification notification)
    {
        t = notification;
        return this;
    }

    public gjl a(Uri uri)
    {
        o = uri;
        return this;
    }

    public gjl a(inq inq1)
    {
        B = inq1;
        return this;
    }

    public gjl a(String s1)
    {
        a = s1;
        return this;
    }

    public gjl a(boolean flag)
    {
        u = flag;
        return this;
    }

    public gjl a(byte abyte0[])
    {
        A = abyte0;
        return this;
    }

    public String a()
    {
        return a;
    }

    public gjl b(int i1)
    {
        d = i1;
        return this;
    }

    public gjl b(String s1)
    {
        b = s1;
        return this;
    }

    public gjl b(boolean flag)
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

    public gjl c(String s1)
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

    public gjl c(boolean flag)
    {
        x = flag;
        return this;
    }

    public gjl d(String s1)
    {
        k = s1;
        return this;
    }

    public gjl d(boolean flag)
    {
        y = flag;
        return this;
    }

    public kuf d()
    {
        return f;
    }

    public int e()
    {
        return d;
    }

    public gjl e(String s1)
    {
        l = s1;
        return this;
    }

    public gjl e(boolean flag)
    {
        z = flag;
        return this;
    }

    public gjl f(String s1)
    {
        i = s1;
        return this;
    }

    public String f()
    {
        return h;
    }

    public gjl g(String s1)
    {
        j = s1;
        return this;
    }

    public String g()
    {
        return k;
    }

    public gjl h(String s1)
    {
        m = s1;
        return this;
    }

    public String h()
    {
        return l;
    }

    public gjl i(String s1)
    {
        n = s1;
        return this;
    }

    public String i()
    {
        return i;
    }

    public gjl j(String s1)
    {
        p = s1;
        return this;
    }

    public String j()
    {
        return j;
    }

    public gjl k(String s1)
    {
        q = s1;
        return this;
    }

    public String k()
    {
        return m;
    }

    public gjl l(String s1)
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

    public gjl m(String s1)
    {
        e = s1;
        return this;
    }

    public gjl n(String s1)
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
        if (A == null)
        {
            i1 = 0;
        } else
        {
            i1 = A.length;
        }
        stringbuilder = (new StringBuilder("CallInfo:\n sessionId: ")).append(a).append("\n resolvedHangoutId: ").append(h).append("\n domain: ").append(i).append("\n roomName: ").append(j).append("\n calendarId: ").append(m).append("\n eventId: ").append(n).append("\n externalKeyName: ").append(k).append("\n externalKeyId: ").append(l).append("\n originalUri: ").append(o).append("\n accountName: ").append(p).append("\n clientId: ").append(q).append("\n gcmRegistration: ").append(r).append("\n compressedLogFile: ").append(e).append("\n hasVideo: ").append(u).append("\n shouldManagePlatformInteraction: ").append(v).append("\n isUserMinor: ").append(x).append("\n isOnAirAllowed: ").append(y).append("\n isAbuseTosAccepted: ").append(z).append("\n userLocationBytes is ");
        if (A == null)
        {
            s1 = "";
        } else
        {
            s1 = "not ";
        }
        return stringbuilder.append(s1).append("null\n userLocationBytes length: ").append(i1).append("\n videoCallOptions: ").append(B).toString();
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

    public boolean x()
    {
        return z;
    }

    public byte[] y()
    {
        return A;
    }

    public boolean z()
    {
        return g;
    }
}
