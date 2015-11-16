// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jmr
    implements jnx
{

    public static final jmr a;
    public static final jmr b;
    public static final jmr c;
    public static final jmr d;
    public static final jmr e;
    public static final jmr f;
    public static final jmr g;
    public static final jmr h;
    public static final jmr i;
    public static final jmr j;
    public static final jmr k;
    public static final jmr l;
    public static final jmr m;
    public static final jmr n;

    public jmr()
    {
    }

    public static jmr a(char c1)
    {
        return new jmy(c1);
    }

    public String a(CharSequence charsequence)
    {
        for (int i1 = charsequence.length() - 1; i1 >= 0; i1--)
        {
            if (!b(charsequence.charAt(i1)))
            {
                return charsequence.subSequence(0, i1 + 1).toString();
            }
        }

        return "";
    }

    public boolean a(Character character)
    {
        return b(character.charValue());
    }

    public volatile boolean a(Object obj)
    {
        return a((Character)obj);
    }

    public abstract boolean b(char c1);

    public String toString()
    {
        return super.toString();
    }

    static 
    {
        a = jnj.p;
        b = jmu.o;
        c = jmt.o;
        d = jmv.o;
        e = jmz.o;
        f = jnb.o;
        g = jnc.o;
        h = jne.o;
        i = jnd.o;
        j = jna.o;
        k = jmx.o;
        l = jni.o;
        m = jms.o;
        n = jng.o;
    }
}
