// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class bzl
    implements android.os.Parcelable.Creator
{

    bzl()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new bzk(parcel);
    }

    public Object[] newArray(int i)
    {
        return new bzk[i];
    }
}
