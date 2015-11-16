// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;

public final class fuo
    implements android.os.Parcelable.Creator
{

    public fuo()
    {
    }

    public static void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, getcloudsyncoptinstatusresponse.a);
        g.b(parcel, 2, getcloudsyncoptinstatusresponse.b);
        g.a(parcel, 3, getcloudsyncoptinstatusresponse.c);
        g.a(parcel, 4, getcloudsyncoptinstatusresponse.d);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int k = g.a(parcel);
        boolean flag = false;
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

                case 4: // '\004'
                    flag1 = g.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCloudSyncOptInStatusResponse(i, j, flag, flag1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GetCloudSyncOptInStatusResponse[i];
    }
}
