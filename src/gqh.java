// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;

public final class gqh
{

    public static final Property a = Property.of(android/view/View, java/lang/Float, "pivotX");
    public static final Property b = Property.of(android/view/View, java/lang/Float, "pivotY");
    public static final Property c;
    public static final Property d;
    public static final Property e;
    public static final Property f;

    static 
    {
        c = new gqi(java/lang/Float, "width");
        d = new gqj(java/lang/Float, "height");
        e = new gqk(c, View.X, "anchorPositionX");
        f = new gqk(d, View.Y, "anchorPositionY");
    }
}
