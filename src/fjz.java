// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class fjz
{

    public float a;
    public float b;

    public fjz()
    {
    }

    public StreetViewPanoramaOrientation a()
    {
        return new StreetViewPanoramaOrientation(b, a);
    }

    public fjz a(float f)
    {
        b = f;
        return this;
    }

    public fjz b(float f)
    {
        a = f;
        return this;
    }
}
