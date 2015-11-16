// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class hjn
    implements android.os.Parcelable.Creator
{

    hjn()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new hjm(parcel);
    }

    public Object[] newArray(int i)
    {
        return new hjm[i];
    }
}
