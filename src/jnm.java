// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public abstract class jnm extends Enum
{

    public static final jnm a;
    public static final jnm b;
    public static final jnm c;
    public static final jnm d;
    public static final jnm e;
    public static final jnm f;
    public static final jnm g;
    public static final jnm h;
    static final jnm i[][];
    private static final jnm j[];

    jnm(String s, int k)
    {
        super(s, k);
    }

    public static jnm a(jok jok1, boolean flag, boolean flag1)
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
        return i[jok1.ordinal()][byte0 | flag2];
    }

    public static jnm valueOf(String s)
    {
        return (jnm)Enum.valueOf(jnm, s);
    }

    public static jnm[] values()
    {
        return (jnm[])j.clone();
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        return a(joh, referenceentry.getKey(), referenceentry.getHash(), referenceentry1);
    }

    abstract com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh, Object obj, int k, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry);

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
        a = new jnn("STRONG");
        b = new jno("STRONG_EXPIRABLE");
        c = new jnp("STRONG_EVICTABLE");
        d = new jnq("STRONG_EXPIRABLE_EVICTABLE");
        e = new jnr("WEAK");
        f = new jns("WEAK_EXPIRABLE");
        g = new jnt("WEAK_EVICTABLE");
        h = new jnu("WEAK_EXPIRABLE_EVICTABLE");
        j = (new jnm[] {
            a, b, c, d, e, f, g, h
        });
        jnm jnm1 = a;
        jnm jnm2 = b;
        jnm jnm3 = c;
        jnm jnm4 = d;
        jnm jnm5 = e;
        jnm jnm6 = f;
        jnm jnm7 = g;
        jnm jnm8 = h;
        i = (new jnm[][] {
            new jnm[] {
                jnm1, jnm2, jnm3, jnm4
            }, new jnm[0], new jnm[] {
                jnm5, jnm6, jnm7, jnm8
            }
        });
    }
}
