// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class hbp
    implements android.os.Parcelable.Creator
{

    hbp()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new hbo(parcel);
    }

    public Object[] newArray(int i)
    {
        return new hbo[i];
    }
}
