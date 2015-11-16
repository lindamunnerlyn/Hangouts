// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

class nw
{

    nw()
    {
    }

    public Drawable a(CompoundButton compoundbutton)
    {
        return h.a(compoundbutton);
    }

    public void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        if (compoundbutton instanceof pj)
        {
            ((pj)compoundbutton).a(colorstatelist);
        }
    }

    public void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        if (compoundbutton instanceof pj)
        {
            ((pj)compoundbutton).a(mode);
        }
    }
}
