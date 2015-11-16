// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;

public final class fwn
    implements android.os.Parcelable.Creator
{

    public fwn()
    {
    }

    public static void a(ChannelSendFileResponse channelsendfileresponse, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, channelsendfileresponse.a);
        g.b(parcel, 2, channelsendfileresponse.b);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
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
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ChannelSendFileResponse(i, j);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ChannelSendFileResponse[i];
    }
}
