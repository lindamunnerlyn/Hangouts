// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class djv extends dgj
    implements alx, Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new djw();
    private final long a;

    protected djv(Parcel parcel)
    {
        super(parcel);
        a = parcel.readLong();
    }

    public djv(aoa aoa, long l)
    {
        super(aoa);
        a = l;
    }

    public int a(alt alt)
    {
        super.b(alt);
        RealTimeChatService.b(super.b.b, a);
        return aly.c;
    }

    public void a()
    {
        a(((dmf) (new cxc(a))));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.a(parcel, i);
        parcel.writeLong(a);
    }

}
