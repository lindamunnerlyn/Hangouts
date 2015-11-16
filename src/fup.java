// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;

public final class fup
    implements android.os.Parcelable.Creator
{

    public fup()
    {
    }

    public static void a(GetCloudSyncSettingResponse getcloudsyncsettingresponse, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, getcloudsyncsettingresponse.a);
        g.b(parcel, 2, getcloudsyncsettingresponse.b);
        g.a(parcel, 3, getcloudsyncsettingresponse.c);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int k = g.a(parcel);
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    flag = g.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCloudSyncSettingResponse(i, j, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GetCloudSyncSettingResponse[i];
    }
}
