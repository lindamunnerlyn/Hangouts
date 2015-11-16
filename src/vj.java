// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PorterDuffColorFilter;

public final class vj extends he
    implements gbj
{

    public vj()
    {
        super(6);
    }

    public vj(byte byte0)
    {
        super(1000);
    }

    private static int b(int i, android.graphics.PorterDuff.Mode mode)
    {
        return (i + 31) * 31 + mode.hashCode();
    }

    PorterDuffColorFilter a(int i, android.graphics.PorterDuff.Mode mode)
    {
        return (PorterDuffColorFilter)a(Integer.valueOf(b(i, mode)));
    }

    PorterDuffColorFilter a(int i, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
    {
        return (PorterDuffColorFilter)a(Integer.valueOf(b(i, mode)), porterduffcolorfilter);
    }

    public void b(int i)
    {
        switch (i)
        {
        default:
            return;

        case 15: // '\017'
        case 60: // '<'
        case 80: // 'P'
            a(-1);
            return;

        case 10: // '\n'
            a(b() / 2);
            return;
        }
    }

    public void h()
    {
        a(-1);
    }
}
