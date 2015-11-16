// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public abstract class jhw extends Enum
{

    public static final jhw a;
    public static final jhw b;
    public static final jhw c;
    public static final jhw d;
    public static final jhw e;
    public static final jhw f;
    public static final jhw g;
    public static final jhw h;
    static final jhw i[];
    private static final jhw j[];

    jhw(String s, int k)
    {
        super(s, k);
    }

    public static jhw valueOf(String s)
    {
        return (jhw)Enum.valueOf(jhw, s);
    }

    public static jhw[] values()
    {
        return (jhw[])j.clone();
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jin jin, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        return a(jin, referenceentry.getKey(), referenceentry.getHash(), referenceentry1);
    }

    abstract com.google.common.cache.LocalCache.ReferenceEntry a(jin jin, Object obj, int k, com.google.common.cache.LocalCache.ReferenceEntry referenceentry);

    void a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        referenceentry1.setAccessTime(referenceentry.getAccessTime());
        LocalCache.a(referenceentry.getPreviousInAccessQueue(), referenceentry1);
        LocalCache.a(referenceentry1, referenceentry.getNextInAccessQueue());
        LocalCache.b(referenceentry);
    }

    void b(com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        referenceentry1.setWriteTime(referenceentry.getWriteTime());
        LocalCache.b(referenceentry.getPreviousInWriteQueue(), referenceentry1);
        LocalCache.b(referenceentry1, referenceentry.getNextInWriteQueue());
        LocalCache.c(referenceentry);
    }

    static 
    {
        a = new jhx("STRONG");
        b = new jhy("STRONG_ACCESS");
        c = new jhz("STRONG_WRITE");
        d = new jia("STRONG_ACCESS_WRITE");
        e = new jib("WEAK");
        f = new jic("WEAK_ACCESS");
        g = new jid("WEAK_WRITE");
        h = new jie("WEAK_ACCESS_WRITE");
        j = (new jhw[] {
            a, b, c, d, e, f, g, h
        });
        i = (new jhw[] {
            a, b, c, d, e, f, g, h
        });
    }
}
