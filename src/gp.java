// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class gp
{

    final gt a;

    public gp(gt gt1)
    {
        a = gt1;
    }

    protected abstract boolean a();

    public boolean a(CharSequence charsequence, int i)
    {
        if (charsequence == null || i < 0 || charsequence.length() - i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (a == null)
        {
            return a();
        } else
        {
            return a(charsequence, 0, i);
        }
    }

    boolean a(CharSequence charsequence, int i, int j)
    {
        boolean flag = false;
        switch (a.a(charsequence, 0, j))
        {
        default:
            flag = a();
            // fall through

        case 1: // '\001'
            return flag;

        case 0: // '\0'
            return true;
        }
    }
}
