// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.EdgeEffect;

final class ox extends ov
{

    ox()
    {
    }

    public boolean a(Object obj, float f, float f1)
    {
        ((EdgeEffect)obj).onPull(f, f1);
        return true;
    }
}
