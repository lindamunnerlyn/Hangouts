// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gmt
{

    private String a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    public gmt()
    {
        a = null;
        b = null;
        c = null;
        d = true;
        e = true;
        f = false;
        g = false;
        h = false;
        i = null;
        j = 0L;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
    }

    public gmt a(long l1)
    {
        j = l1;
        return this;
    }

    public gmt a(String s)
    {
        a = s;
        return this;
    }

    public gmt a(boolean flag)
    {
        d = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public gmt b(String s)
    {
        b = s;
        return this;
    }

    public gmt b(boolean flag)
    {
        e = flag;
        return this;
    }

    public String b()
    {
        return b;
    }

    public gmt c(String s)
    {
        c = s;
        return this;
    }

    public gmt c(boolean flag)
    {
        k = flag;
        return this;
    }

    public String c()
    {
        return c;
    }

    public gmt d(String s)
    {
        i = s;
        return this;
    }

    public gmt d(boolean flag)
    {
        l = flag;
        return this;
    }

    public boolean d()
    {
        return d;
    }

    public gmt e(boolean flag)
    {
        m = flag;
        return this;
    }

    public boolean e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof gmt)
        {
            obj = (gmt)obj;
            if (g() && ((gmt) (obj)).g())
            {
                return true;
            }
            if (a() != null && ((gmt) (obj)).a() != null && a().equals(((gmt) (obj)).a()))
            {
                return true;
            }
        }
        return false;
    }

    public gmt f()
    {
        f = true;
        return this;
    }

    public gmt f(boolean flag)
    {
        n = flag;
        return this;
    }

    public gmt g(boolean flag)
    {
        o = flag;
        return this;
    }

    public boolean g()
    {
        return f;
    }

    public gmt h(boolean flag)
    {
        p = flag;
        return this;
    }

    public String h()
    {
        return i;
    }

    public long i()
    {
        return j;
    }

    public gmt i(boolean flag)
    {
        g = flag;
        return this;
    }

    public gmt j(boolean flag)
    {
        h = flag;
        return this;
    }

    public boolean j()
    {
        return m;
    }

    public gmt k(boolean flag)
    {
        q = flag;
        return this;
    }

    public boolean k()
    {
        return n;
    }

    public boolean l()
    {
        return o;
    }

    public boolean m()
    {
        return !l();
    }

    public boolean n()
    {
        return p;
    }

    public boolean o()
    {
        return g;
    }

    public boolean p()
    {
        return h;
    }

    public boolean q()
    {
        return q;
    }

    public String toString()
    {
        return (new StringBuilder("Participant: ")).append(a).append("\n userId: ").append(i).append("\n isLoudestSpeaker: ").append(i).append("\n connectionTime: ").append(j).append("\n isAudioMuted: ").append(d).append("\n isVideoMuted: ").append(e).append("\n isLocalUser: ").append(f).append("\n isLoudestSpeaker: ").append(k).append("\n isPresenter: ").append(l).append("\n isPinned: ").append(m).append("\n isFocused: ").append(n).append("\n isPstn: ").append(o).append("\n isMediaBlocked: ").append(p).append("\n isAllowedToInvite: ").append(g).append("\n isAllowedToKick: ").append(h).append("\n isVideoValid: ").append(q).toString();
    }
}
