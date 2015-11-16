// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class atw
    implements android.os.Parcelable.Creator
{

    atw()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new atv(parcel);
    }

    public Object[] newArray(int i)
    {
        return new atv[i];
    }
}
