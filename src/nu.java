// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

public final class nu
{

    private static final nw a;

    public static Drawable a(CompoundButton compoundbutton)
    {
        return a.a(compoundbutton);
    }

    public static void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        a.a(compoundbutton, colorstatelist);
    }

    public static void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        a.a(compoundbutton, mode);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new nv();
        } else
        if (i >= 21)
        {
            a = new nx();
        } else
        {
            a = new nw();
        }
    }
}
