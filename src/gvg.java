// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gvg
    implements android.os.Parcelable.Creator
{

    gvg()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new gvf(parcel);
    }

    public Object[] newArray(int i)
    {
        return new gvf[i];
    }
}
