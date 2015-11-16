// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class knu
{

    static final int a = 11;
    static final int b = 12;
    static final int c = 16;
    static final int d = 26;

    public static int a(int i)
    {
        return i & 7;
    }

    static int a(int i, int j)
    {
        return i << 3 | j;
    }

    static Object a(klr klr1, knw knw1, koc koc1)
    {
        switch (knv.a[knw1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            return Double.valueOf(klr1.b());

        case 2: // '\002'
            return Float.valueOf(klr1.c());

        case 3: // '\003'
            return Long.valueOf(klr1.e());

        case 4: // '\004'
            return Long.valueOf(klr1.d());

        case 5: // '\005'
            return Integer.valueOf(klr1.f());

        case 6: // '\006'
            return Long.valueOf(klr1.g());

        case 7: // '\007'
            return Integer.valueOf(klr1.h());

        case 8: // '\b'
            return Boolean.valueOf(klr1.i());

        case 9: // '\t'
            return klr1.l();

        case 10: // '\n'
            return Integer.valueOf(klr1.m());

        case 11: // '\013'
            return Integer.valueOf(klr1.o());

        case 12: // '\f'
            return Long.valueOf(klr1.p());

        case 13: // '\r'
            return Integer.valueOf(klr1.q());

        case 14: // '\016'
            return Long.valueOf(klr1.r());

        case 15: // '\017'
            return koc1.a(klr1);

        case 16: // '\020'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");

        case 17: // '\021'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");

        case 18: // '\022'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
        }
    }

    public static int b(int i)
    {
        return i >>> 3;
    }

}
