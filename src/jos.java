// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public abstract class jos extends Enum
{

    public static final jos a;
    public static final jos b;
    public static final jos c;
    public static final jos d;
    public static final jos e;
    public static final jos f;
    public static final jos g;
    public static final jos h;
    static final jos i[];
    private static final jos j[];

    jos(String s, int k)
    {
        super(s, k);
    }

    public static jos valueOf(String s)
    {
        return (jos)Enum.valueOf(jos, s);
    }

    public static jos[] values()
    {
        return (jos[])j.clone();
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        return a(jpj, referenceentry.getKey(), referenceentry.getHash(), referenceentry1);
    }

    abstract com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj, Object obj, int k, com.google.common.cache.LocalCache.ReferenceEntry referenceentry);

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
        a = new jot("STRONG");
        b = new jou("STRONG_ACCESS");
        c = new jov("STRONG_WRITE");
        d = new jow("STRONG_ACCESS_WRITE");
        e = new jox("WEAK");
        f = new joy("WEAK_ACCESS");
        g = new joz("WEAK_WRITE");
        h = new jpa("WEAK_ACCESS_WRITE");
        j = (new jos[] {
            a, b, c, d, e, f, g, h
        });
        i = (new jos[] {
            a, b, c, d, e, f, g, h
        });
    }
}
