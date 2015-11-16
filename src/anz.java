// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class anz
    implements android.os.Parcelable.Creator
{

    anz()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        any any1 = new any();
        any1.b = parcel.readString();
        any1.c = parcel.readString();
        any1.d = parcel.readString();
        any1.e = parcel.readInt();
        any1.f = parcel.readString();
        any1.g = parcel.readString();
        return any1;
    }

    public Object[] newArray(int i)
    {
        return new any[i];
    }
}
