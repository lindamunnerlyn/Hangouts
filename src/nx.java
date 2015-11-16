// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.widget.CompoundButton;

class nx extends nw
{

    nx()
    {
    }

    public void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        compoundbutton.setButtonTintList(colorstatelist);
    }

    public void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        compoundbutton.setButtonTintMode(mode);
    }
}
