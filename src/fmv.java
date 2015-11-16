// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class fmv
{

    public float a;
    public float b;

    public fmv()
    {
    }

    public StreetViewPanoramaOrientation a()
    {
        return new StreetViewPanoramaOrientation(b, a);
    }

    public fmv a(float f)
    {
        b = f;
        return this;
    }

    public fmv b(float f)
    {
        a = f;
        return this;
    }
}
