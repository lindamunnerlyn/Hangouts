// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;

public final class gus
{

    public static final Property a = Property.of(android/view/View, java/lang/Float, "pivotX");
    public static final Property b = Property.of(android/view/View, java/lang/Float, "pivotY");
    public static final Property c;
    public static final Property d;
    public static final Property e;
    public static final Property f;

    static 
    {
        c = new gut(java/lang/Float, "width");
        d = new guu(java/lang/Float, "height");
        e = new guv(c, View.X, "anchorPositionX");
        f = new guv(d, View.Y, "anchorPositionY");
    }
}
