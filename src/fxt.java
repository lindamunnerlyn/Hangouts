// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.OpenChannelResponse;

public final class fxt
    implements android.os.Parcelable.Creator
{

    public fxt()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
        ChannelImpl channelimpl = null;
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
                    channelimpl = (ChannelImpl)g.a(parcel, l, ChannelImpl.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OpenChannelResponse(i, j, channelimpl);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new OpenChannelResponse[i];
    }
}
