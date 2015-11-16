// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public abstract class jum extends Enum
{

    public static final jum a;
    public static final jum b;
    public static final jum c;
    public static final jum d;
    public static final jum e;
    public static final jum f;
    public static final jum g;
    public static final jum h;
    static final jum i[][];
    private static final jum j[];

    jum(String s, int k)
    {
        super(s, k);
    }

    public static jum a(jvl jvl1, boolean flag, boolean flag1)
    {
        byte byte0 = 0;
        boolean flag2;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        }
        return i[jvl1.ordinal()][byte0 | flag2];
    }

    public static jum valueOf(String s)
    {
        return (jum)Enum.valueOf(jum, s);
    }

    public static jum[] values()
    {
        return (jum[])j.clone();
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(jvi jvi, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        return a(jvi, referenceentry.getKey(), referenceentry.getHash(), referenceentry1);
    }

    abstract com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(jvi jvi, Object obj, int k, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry);

    void a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        referenceentry1.setExpirationTime(referenceentry.getExpirationTime());
        MapMakerInternalMap.a(referenceentry.getPreviousExpirable(), referenceentry1);
        MapMakerInternalMap.a(referenceentry1, referenceentry.getNextExpirable());
        MapMakerInternalMap.d(referenceentry);
    }

    void b(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        MapMakerInternalMap.b(referenceentry.getPreviousEvictable(), referenceentry1);
        MapMakerInternalMap.b(referenceentry1, referenceentry.getNextEvictable());
        MapMakerInternalMap.e(referenceentry);
    }

    static 
    {
        a = new jun("STRONG");
        b = new juo("STRONG_EXPIRABLE");
        c = new jup("STRONG_EVICTABLE");
        d = new juq("STRONG_EXPIRABLE_EVICTABLE");
        e = new jur("WEAK");
        f = new jus("WEAK_EXPIRABLE");
        g = new jut("WEAK_EVICTABLE");
        h = new juu("WEAK_EXPIRABLE_EVICTABLE");
        j = (new jum[] {
            a, b, c, d, e, f, g, h
        });
        jum jum1 = a;
        jum jum2 = b;
        jum jum3 = c;
        jum jum4 = d;
        jum ajum[] = new jum[0];
        jum jum5 = e;
        jum jum6 = f;
        jum jum7 = g;
        jum jum8 = h;
        i = (new jum[][] {
            new jum[] {
                jum1, jum2, jum3, jum4
            }, ajum, new jum[] {
                jum5, jum6, jum7, jum8
            }
        });
    }
}
